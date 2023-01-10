<template>
  <div id="app">
    <MyTool></MyTool>
  </div>
</template>

<script>
import MyTool from '@/components/MyTool.vue'

export default {
  name: 'App',
  components: {
    MyTool
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
