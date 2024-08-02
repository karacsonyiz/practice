window.onload = function(){
getPrincipal();
loadSurveys();
}

function loadSurveys() {
        fetch("/surveys")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                console.log(jsonData);
            }).catch(error => console.log(error));
}
