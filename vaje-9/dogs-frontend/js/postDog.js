import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'
    
createApp({
  data() {
    return {
      pes:{
        idDog:"",
        nameDog:"",
        breedDog:"",
        lengthDog:"",
        weightDog:""
      }
    }
  },
  
  methods: {
    postData() {
      axios.post('http://localhost:8080/dog/addDog', this.pes)
      .then(function (response) {
        document.getElementById("message").innerHTML=("Pes je uspešno registriran");
      })
      .catch(function (error) {
        console.log(error);
      });
  }
}
}
).mount('#app')