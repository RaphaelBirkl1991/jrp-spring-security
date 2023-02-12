// For a pie chart

new Chart(document.getElementById("myPieChart"),{
    type: 'pie',


// The Data for our dataset
    data:{
        labels:['January', 'February', 'March'],
        datasets: [{
            label: 'My first dataset',
            backgroundColor: ["#3e95cd", "#8e5ea2", "#3cba9f"],
            borderColor: 'rgb(255, 99, 132)',
            data:[12, 10, 5]
        }]
    },
 //configuration options go here
    options:{}
});

