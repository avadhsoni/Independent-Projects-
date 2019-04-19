function nameVal(value) {
   var val = document.getElementById('error1').value;

   if (val == "") {
      document.getElementById('error1').style.borderColor = "red";
      document.getElementById('error1').style.borderWidth = "thick";
      return false;
   } else {
      document.getElementById('error1').style.borderColor = "green";
      document.getElementById('error1').style.borderWidth = "thick";
   }

   if (/^[0-9]+$/.test(document.getElementById('error1').value)) {
      alert("First Name Contains Numbers!");
      document.getElementById('error1').style.borderColor = "red";
      document.getElementById('error1').style.borderWidth = "thick";
      return false;
   } else {
      document.getElementById('error1').style.borderColor = "green";
      document.getElementById('error1').style.borderWidth = "thick";
   }
}

function LastnameVal(value) {
   var val = document.getElementById('error2').value;

   if (val == "") {
      document.getElementById('error2').style.borderColor = "red";
      document.getElementById('error2').style.borderWidth = "thick";
      return false;
   } else {
      document.getElementById('error2').style.borderColor = "green";
      document.getElementById('error2').style.borderWidth = "thick";
   }

   if (/^[0-9]+$/.test(document.getElementById('error2').value)) {
      alert("First Name Contains Numbers!");
      document.getElementById('error2').style.borderColor = "red";
      document.getElementById('error2').style.borderWidth = "thick";
      return false;
   } else {
      document.getElementById('error2').style.borderColor = "green";
      document.getElementById('error2').style.borderWidth = "thick";
   }
}

function phoneVal(value) {
   var val = document.getElementById('error3').value;

   if (val == "") {
      document.getElementById('error3').style.borderColor = "red";
      document.getElementById('error3').style.borderWidth = "thick";
      return false;
   } else {
      document.getElementById('error3').style.borderColor = "green";
      document.getElementById('error3').style.borderWidth = "thick";
   }

   if (!/^\d*\.?\d*$/.test(document.getElementById('error3').value)) {
      alert("Only Numbers Please");
      document.getElementById('error3').style.borderColor = "red";
      document.getElementById('error3').style.borderWidth = "thick";
      return false;
   } else {
      document.getElementById('error3').style.borderColor = "green";
      document.getElementById('error3').style.borderWidth = "thick";
   }
}

function emailVal(value) {
   var val = document.getElementById('error4').value;

   if (val == "") {
      document.getElementById('error4').style.borderColor = "red";
      document.getElementById('error4').style.borderWidth = "thick";
      return false;
   } else {
      document.getElementById('error4').style.borderColor = "green";
      document.getElementById('error4').style.borderWidth = "thick";
   }

   if (!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(document.getElementById('error4').value)) {
      alert("Please enter a valid email address");
      document.getElementById('error4').style.borderColor = "red";
      document.getElementById('error4').style.borderWidth = "thick";
      return false;
   } else {
      document.getElementById('error4').style.borderColor = "green";
      document.getElementById('error4').style.borderWidth = "thick";
   }
}

function openNav() {
   document.getElementById("open").style.display = "none";
   document.getElementById("nav").style.width = "100%";
}

function closeNav() {
   document.getElementById("nav").style.width = "0";
   document.getElementById("open").style.display = "block";
}

function show() {
   var show = document.getElementById("para");
   if (show.style.display === "none") {
      show.style.display = "block";
   } else {
      show.style.display = "none";
   }
}
function show2() {
   var show = document.getElementById("para2");
   if (show.style.display === "none") {
      show.style.display = "block";
   } else {
      show.style.display = "none";
   }
}
function show3() {
   var show = document.getElementById("para3");
   if (show.style.display === "none") {
      show.style.display = "block";
   } else {
      show.style.display = "none";
   }
}
