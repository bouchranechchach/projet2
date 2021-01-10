<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>AppCrédit, pour un meilleur avenir !</title>
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700|Raleway:300,600" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css'>
<link rel="stylesheet" href="css/stylelogin1.css">

</head>
<body>
<!-- partial:index.partial.html -->
<div class="container">
   <section id="formHolder">

      <div class="row">

         <!-- Brand Box -->
         <div class="col-sm-6 brand">
            <a href="#" class="logo">	Welcome to AppCrédit</a>

            <div class="heading">
               <h2>AppCrédit</h2>
               <p>Le meilleur choix </p>
            </div>

            <div class="success-msg">
               <p>Génial ! Vous etes inscrit !</p>
               <a href="home.jsp" class="profile">Votre profile</a>
            </div>
         </div>


         <!-- Form Box -->
         <div class="col-sm-6 form">

            <!-- Login Form -->
            <div class="login form-peice switched">
               <form class="login-form" action="Login" method="post">
                  <div class="form-group">
                     <label for="loginemail">Nom</label>
                     <input type="text" name="username" id="username" required>
                  </div>

                  <div class="form-group">
                     <label for="loginPassword">Mot de passe</label>
                     <input type="password" name="pass" id="pass" required>
                  </div>

                  <div class="CTA">
                     <input type="submit" value="Se connecter">
                     <a href="#" class="switch">Je suis nouveau !</a>
                  </div>
               </form>
            </div><!-- End Login Form -->


            <!-- Signup Form -->
            <div class="signup form-peice">
               <form class="signup-form" action="InsertServlet" method="post">

                  <div class="form-group">
                     <label for="name">Entrez votre nom</label>
                     <input type="text" name="nom" id="nom" class="nom">
                     <span class="error"></span>
                  </div>
                   <div class="form-group">
                     <label for="name">Entrez votre prenom</label>
                     <input type="text" name="prenom" id="prenom" class="prenom">
                     <span class="error"></span>
                  </div>
						
						<div class="form-group">
                     <label for="name">Entrez votre Adresse</label>
                     <input type="text" name="adresse" id="adresse" class="adresse">
                     <span class="error"></span>
                  </div>
                  <div class="form-group">
                     <label for="name">Entrez votre Ville</label>
                     <input type="text" name="ville" id="ville" class="ville">
                     <span class="error"></span>
                  </div>
                  

                 <div class="form-group">
                     <label for="name">Entrez votre numéro de téléphone</label>
                     <input type="text" name="tel" id="tel" class="tel">
                     <span class="error"></span>
                  </div>
                  <div class="form-group">
                     <label for="email">Entrez votre email</label>
                     <input type="email" name="email" id="email" class="email">
                     <span class="error"></span>
                  </div>

                  <div class="form-group">
                     <label for="password">Saisir un mot de passe</label>
                     <input type="password" name="password" id="password" class="password">
                     <span class="error"></span>
                  </div>

                  <div class="form-group">
                     <label for="passwordCon">Confirmer votre mot de passe</label>
                     <input type="password" name="passwordCon" id="passwordCon" class="passConfirm">
                     <span class="error"></span>
                  </div>

                  <div class="CTA">
                     <input type="submit"  value="S'inscrir" id="submit">
                     <a href="#" class="switch">J'ai déja un compte ! </a>
                  </div>
               </form>
            </div><!-- End Signup Form -->
         </div>
      </div>

   </section>


   <footer>
      <p>
         Université mohammed V
      </p>
   </footer>

</div>
<!-- partial -->
  <script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
<script  src="js/scriptlogin.js"></script>

</body>
</html>
