<script type="text/x-template" id="demo-vue-component">
    <div>
        <h2>vue component</h2>
        <input type="text" name="name" v-model="name">
        <button @click="getUserData">get</button>
        <div id="vue-div">{{ user.name }}</div>
    </div>
</script>
<script>
    let vueComponent = new Vue({
        el: '#demo-vue-component',
        data: function () {
            return {
                name: '',
                user: {
                    name: ''
                }
            }
        },
        methods: {
            getUserData: function () {
                const that = this;
                const url = '/api/user/' + this.name;
                axios.get(url)
                    .then(function (response) {
                        console.log(response.data)
                        console.log(this)
                        that.user.name = response.data.name;
                    });
                console.log(this.name)
            }
        }
    });
</script>
