<template>
  <div id="app">

    <app-header></app-header>
    <app-content></app-content>
    <app-footer></app-footer>
  </div>
</template>

<script>
    import Header from "./components/Header";
    import Footer from "./components/Footer";
    import myLive from "./components/WebCamera";
export default {
  name: 'App',
    components: {
    "app-header": Header,
    "app-footer": Footer,
    "app-content": myLive,
  },

}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
