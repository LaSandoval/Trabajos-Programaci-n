
var select= document.getElementById("tipo");
var toxo= document.getElementById("toxiss");
var entre= document.getElementById("nivel");


select.addEventListener("change", function() {
    
    
    
  if (select.value === "felino") {
    toxo.style.display = "block";
    entre.style.display = "none";
  } else if (select.value === "canino") {
    toxo.style.display = "none";
    entre.style.display = "block";
  }
});
