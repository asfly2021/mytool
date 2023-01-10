<template>
 <div class="card">
  <div class="app-name">{{ app.name }}</div>
 </div>
</template>

<script>
export default {
  props: ['app'],
  data () {
    return {
      titleColor: '#'
    }
  },
  methods: {
    show() {
      console.log("@app", this.app)
    },
    // 生成随机颜色
    getRandomColor() {
      let randomArr = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'];
      for (let i =0; i<6; i++) {
        this.titleColor += randomArr[Math.ceil(Math.random()*(15-0)+0)];
      }
      if (this.titleColor=="#f8f8f8") {
        this.getRandomColor();
      }
    },
   
  },
  created() {
    this.show();
    this.getRandomColor();
  }
}

</script>
<style>
.card {
  text-align: center;
}
.card .app-name {
    height: 70px;
    line-height: 70px;
    /* display: inline; */
    cursor: pointer;
    transition: all ease-in 0.2s;
    font-size: 40px; 

  }
.card .app-name:hover {
  transition: all ease-in-out 0.3s;
  /* transform: scale(2.2); */
  font-size: 60px;
}
.app-name {
  text-align: center;
  color: v-bind(titleColor);
}
</style>
