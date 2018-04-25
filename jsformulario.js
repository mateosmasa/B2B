botonRegistrarOff();
function verificarnia(){
    
    var pswd=document.getElementById('pass');
    var reppswd=document.getElementById('confirmarpass');
     var verification=document.getElementById('verificacion');
    
        if(pass.value!=reppswd.value){
           alert("No coinciden las contraseñas")
            
            
        }
  
}   

function botonRegistrarOn(){
    
     document.getElementById("botonregistrar").disabled=false;
    console.log("jaaambo")
}
function botonRegistrarOff(){
    document.getElementById("botonregistrar").disabled=true;
    console.log("illoouuuuu")
}

function comprobarCampos(){
    var pswd=document.getElementById('pass');
    var reppswd=document.getElementById('confirmarpass');
    var nombre=document.getElementById('nombre');
    var apellido=document.getElementById('apellidos');
    var nia=document.getElementById('NIA');
    var email=document.getElementById('email');
    
    if((pswd.value!="") && (reppswd.value!="") && (nombre.value!="") && (apellido.value!="") && (nia.value!="") && (email.value!="")){
         botonRegistrarOn();
    }else{
        botonRegistrarOff();
    }
       
    
}

