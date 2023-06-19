import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'
    
createApp({
  data() {
    return {
      dogs : []
    }
  },
  
  created(){
    this.handleRequest();
  },
  methods: {
    handleRequest() {
      axios.get("http://localhost:8080/dog/getAllDogs")
    .then((response) => {
      this.dogs = response.data;
    })
    .catch((error) => console.error(error));
   }
  }
}
).mount('#app')