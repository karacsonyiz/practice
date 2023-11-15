window.onload = function(){
loadBooks();
}

function loadBooks(){
        fetch("/books")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                fillTable(jsonData);
            }).catch(error => console.log(error));
}

function fillTable(jsonData) {
let rowDiv = document.querySelector("#rowDiv");

        for(let i = 0;i < jsonData.length; i++){
            let colDiv = document.createElement("div")
            colDiv.setAttribute("class","col-md-4");
            let card = document.createElement("div")
            card.setAttribute("class","card mb-4 box-shadow");
            let img = document.createElement("img");
            img.setAttribute("class","card-img-top");
            img.setAttribute("src","img/egri.jfif");
            img.setAttribute("height","200");
            let cardBody = document.createElement("div");
            cardBody.setAttribute("class","card-body");
            let authorText = document.createElement("p");
            authorText.setAttribute("class","card-text");
            authorText.setAttribute("id","authorText");
            authorText.innerHTML = jsonData[i].author;
            let titleText = document.createElement("p");
            titleText.setAttribute("class","card-text");
            titleText.setAttribute("id","titleText");
            titleText.innerHTML = jsonData[i].title;
            let btnGroupDiv = document.createElement("div");
            btnGroupDiv.setAttribute("class","btn-group");
            let viewBtn = document.createElement("button");
            viewBtn.setAttribute("type","button");
            viewBtn.setAttribute("class","btn btn-sm btn-outline-secondary");
            viewBtn.innerHTML = "View";
            let buyBtn = document.createElement("button");
            buyBtn.setAttribute("type","button");
            buyBtn.setAttribute("class","btn btn-sm btn-outline-secondary");
            buyBtn.innerHTML = "Buy";
            btnGroupDiv.appendChild(viewBtn);
            btnGroupDiv.appendChild(buyBtn);
            cardBody.appendChild(authorText);
            cardBody.appendChild(titleText);
            cardBody.appendChild(btnGroupDiv);
            card.appendChild(img);
            card.appendChild(cardBody);
            colDiv.appendChild(card);
            rowDiv.appendChild(colDiv);

        }
}

