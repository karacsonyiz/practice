window.onload = function(){
getPrincipal();
loadBooks();
}

function checkPrivileges(principal) {
console.log(principal.authorities[0].authority)
    if(principal.authorities[0].authority == "ROLE_ADMIN") {
    document.querySelector("#adminhref").setAttribute("style","visibility: visible;");
    }
}


function getPrincipal() {
        fetch("/principal")
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                checkPrivileges(jsonData);
            }).catch(error => console.log(error));
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
console.log(jsonData)
let rowDiv = document.querySelector("#rowDiv");

        for(let i = 0;i < jsonData.length; i++){
            let colDiv = document.createElement("div")
            colDiv.setAttribute("class","col-md-4");
            let card = document.createElement("div")
            card.setAttribute("class","card mb-4 box-shadow");
            let img = document.createElement("img");
            img.setAttribute("class","card-img-top");
            img.setAttribute("src",jsonData[i].imgsrc);
            img.setAttribute("alt","NO IMG AVAILABLE");
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
            let priceText = document.createElement("p");
            priceText.setAttribute("class","card-text m-0");
            priceText.setAttribute("id","priceText");
            priceText.innerHTML = jsonData[i].price + " Ft";
            let btnGroupDiv = document.createElement("div");
            let priceDiv = document.createElement("div");
            btnGroupDiv.setAttribute("class","btn-group");
            btnGroupDiv.setAttribute("style","margin-left:200px;");
            let viewBtn = document.createElement("button");
            viewBtn.setAttribute("type","button");
            viewBtn.setAttribute("class","btn btn-sm btn-outline-secondary");
            viewBtn.innerHTML = "View";
            viewBtn.setAttribute("data-toggle","modal");
            viewBtn.setAttribute("data-target","#viewBookModal");
            viewBtn.addEventListener("click", function(){viewBook(jsonData[i].id);}, false);
            let buyBtn = document.createElement("button");
            buyBtn.setAttribute("type","button");
            buyBtn.setAttribute("class","btn btn-sm btn-outline-secondary");
            buyBtn.innerHTML = "Buy";
            priceDiv.appendChild(priceText);
            btnGroupDiv.appendChild(viewBtn);
            btnGroupDiv.appendChild(buyBtn);
            cardBody.appendChild(authorText);
            cardBody.appendChild(titleText);
            priceDiv.appendChild(btnGroupDiv);
            cardBody.appendChild(priceDiv);
            card.appendChild(img);
            card.appendChild(cardBody);
            colDiv.appendChild(card);
            rowDiv.appendChild(colDiv);

        }
}

function viewBook(id) {
        fetch("/book/" + id)
            .then(function(response) {
                return response.json();
            })
            .then(function(jsonData) {
                console.log(jsonData);
                document.querySelector("#synopsys").innerHTML = jsonData.synopsys;
            }).catch(error => console.log(error));
}

