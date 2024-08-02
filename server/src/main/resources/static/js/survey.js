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
                fillSurveyTable(jsonData);
            }).catch(error => console.log(error));
}

function fillSurveyTable(jsonData) {
    console.log(jsonData)
    let surveyRowDiv = document.querySelector("#surveyRowDiv");

    
}
