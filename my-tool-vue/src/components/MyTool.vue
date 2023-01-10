<template>
  <div>
    <h1 style="text-align: center; font-size: 80px">#My-Tool#</My-Tool></h1>
    <div id="app-card" v-for="(item, index) in sortedApp" :key="item.id"><Card :app="item"></Card></div>
    
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
      appList: []
    }
  },
  methods: {
    // 获取所有app
    getAllApps() {
      console.log(this.api.apiURL("/sys/mytoolApp/list"));
      let that = this;
      this.$axios.post(this.api.apiURL("/sys/mytoolApp/list"))
        .then(function (data){
          if (data.data.code == 0) {
            that.appList = data.data.data;
          console.log("@appList", that.appList);
          }
        })
    },
     // app排序
     sortApp() {
      return this.appList.sort(function(a, b) {
        let x = a['sort'];
        let y = b['sort'];
        return (x<y)?-1:((x>y)?1:0);
      });
    },
  },
  computed: {
    sortedApp() {
      return this.sortApp();
     },
  },
  created() {
    this.getAllApps();
  }
}

</script>
<style>
#app-card {
  /* display: block; */
}
</style>
