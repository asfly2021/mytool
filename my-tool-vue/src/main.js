import Vue from 'vue'
import App from './App.vue'
import api from '@/components/sys/api.js'
import axios from 'axios'

Vue.config.productionTip = false;
Vue.prototype.$axios = axios;
Vue.prototype.api = api;

new Vue({
  axios,
  api,
  render: h => h(App),
}).$mount('#app')
