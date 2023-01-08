<template>
  <div>
    <h1>My-Tool</h1>
    <Card></Card>
  </div>

</template>

<script>
import Card from '@/components/Card.vue'

export default {
  components: {
    Card
  },
  data() {
    return {
    }
  },
  methods: {
    getAllApps() {
      console.log(this.api.apiURL("/sys/mytoolApp/list"))
      this.$axios.post(this.api.apiURL("/sys/mytoolApp/list"))
        .then(function (data){
          console.log(data);
        })
    }
  },
  created() {
    this.getAllApps();
  }
}

</script>
<style>

</style>
