<!DOCTYPE html>
<html>
<head>
    <title>MoviePlex | Contact Us</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Bebas Neue' rel='stylesheet'>
	<link href='https://fonts.googleapis.com/css?family=Work Sans' rel='stylesheet'>
    <link rel="shortcut icon" type="image/PNG" href="/images/favicon.PNG"/>
    <link href="css/footer.css" rel="stylesheet">    

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    
    <style>
        html, body {
        	text-align: center;
        	background-color: black;
        	color: white;
        }
        
        body{
			margin-top:5%;
			padding-top:50px;
		}
		
    	#title{font-family:'Bebas Neue';
    	font-size:90px;
    	color:white;
    	font-style:italic;
    	letter-spacing:1px;
    	text-shadow: 2px 2px 4px red;
    	text-align:center;}
    	
    	.navbar-toggler-icon {
        background-image: url("data:image/svg+xml;charset=utf8,%3Csvg viewBox='0 0 32 32' xmlns='http://www.w3.org/2000/svg'%3E%3Cpath stroke='rgba(255,255,255, 1)' stroke-width='2' stroke-linecap='round' stroke-miterlimit='10' d='M4 8h24M4 16h24M4 24h24'/%3E%3C/svg%3E");
        
    </style>
</head>

<body>
    <!--Header-->
    <nav class="navbar navbar-expand-sm flex-column align-items-stretch navbar-inverse bg-inverse fixed-top" style="background-color:#D11616">
    <div class="d-flex align-content-sm-center">
        <a href="./index.html" class="navbar-brand mx-sm-auto mr-auto"><img src="images/Movieplex_fin.png" style="max-width:50%;"></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarMenu" aria-controls="navbarMenu" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </div>
	<div class="d-md-flex d-block flex-row mx-md-auto mx-0">
    <div class="collapse navbar-collapse w-100" id="navbarMenu" style="font-family:'Work Sans';">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a href="./movies.html" class="nav-link" style="color:white;" onMouseOver="this.style.color='black'"
        onMouseOut="this.style.color='white'">MOVIES</a>
            </li>
            <li class="nav-item">
                <a href="trailers.html" class="nav-link" style="color:white;" onMouseOver="this.style.color='black'"
        onMouseOut="this.style.color='white'">TRAILERS</a>
            </li>
			<li class="nav-item">
                <a href="./food.html" class="nav-link" style="color:white;" onMouseOver="this.style.color='black'"
        onMouseOut="this.style.color='white'">FOOD/DRINKS</a>
            </li>
            <li class="nav-item">
                <a href="./contact.html" class="nav-link" style="color:white;font-weight:bold;" onMouseOver="this.style.color='black'"
        onMouseOut="this.style.color='white'">CONTACT US</a>
            </li>
            <li class="nav-item">
                <a href="./locations.html" class="nav-link" style="color:white;" onMouseOver="this.style.color='black'"
        onMouseOut="this.style.color='white'"> LOCATIONS</a>
            </li>
            <li class="nav-item">
                <a href="./news.html" class="nav-link news" style="color:white;" onMouseOver="this.style.color='black'"
        onMouseOut="this.style.color='white'"> NEWS</a>
            </li>
        </ul>
    </div>
	</div>
  </nav> 
    
    <br><br>
    <div class="main">
        <p style="text-align: center;"><img src="https://cdn.jotfor.ms/img/check-icon.png" alt="" width="128" height="128" /></p>
        <p>Thank you for your message <u> <?php echo $_POST["name"] ?></u>.</p><br><br>
        <p>Your name, email address: <u> <?php echo $_POST["email"]; ?></u> and message have been recorded.</p> <br><br>
        <p>We will get back to you in 24 - 48 hours.</p>
    </div>    
    
    <?php
    
    update();
                
    function update() {
        $servername = "localhost";
        $username = "id15329740_admin";
        $password = "WebDev530530-";
        $database = "id15329740_movies";
        $name = $_POST["name"];
        $email = $_POST["email"];
        $message = $_POST["message"];
    
    
        // Create connection
        $conn = new mysqli($servername, $username, $password, $database);
        
        // Check connection
        if ($conn->connect_error) {
            die("Connection failed: " . $conn->connect_error);
        }
        //echo "Connected successfully";
    
        $sql = "INSERT INTO `contact`(`name`, `email`, `message`) VALUES ('$name','$email','$message');";
    
        if ($conn->query($sql) === TRUE) {
          //echo "New record created successfully";
        } else {
          //echo "Error: " . $sql . "<br>" . $conn->error;
        }
    }
    
    ?>


    <!--Footer-->
    <footer class="class=footer" style="bottom: -150px">
      <div id="wrapper">       
        <div class="row2">
          <div class="column2">
              <h4 id="ffont">SPECIAL DISCOUNTS</h4>
              <address>
                    <ul class="list-unstyled ffont">
                      <li>
                        50% discount on Tuesdays<br>
                        40% discount on all food & drinks on Thursdays<br>
                        20% off for all students<br>
                      </li>
                    </ul>
              </address>
          </div>
          <div class="column2">
                <h4 id="ffont">OUR LOCATIONS</h4>
                    <ul class="list-unstyled ffont">
                        <li><a href="locations.html"></a></li>
                        <li><a href="locations.html">Auburn Movieplex 10
                        </a></li>
                        <li><a href="locations.html">Geneva Movieplex 8</a></li>
                        <li><a href="locations.html">Johnstown Movieplex
                        </a></li>
                        <li><a href="locations.html">Massena Movieplex</a></li>
                        <li><a href="locations.html">Movieplex Cinema
                        </a></li>
                    </ul>
          </div>
          <div class="column2">
            <h4 id="ffont">INCOMING MOVIES</h4>
              <ul class="list-unstyled ffont">
                <li><a href="movies.html">Fast & Furious 9</a></li>
                <li><a href="movies.html">Top Gun:Maverick</a></li>
                <li><a href="movies.html">Dune </a></li>
                <li><a href="movies.html">Black Widow</a></li>
              </ul>
          </div>
          <div class="column2">
              <h4 id="ffont">USEFUL PAGES</h4>
              <ul class="list-unstyled ffont">
                <li><a href="ratings.html">Ratings</a></li>
                <li><a href="job.html">Apply for a Job</a></li>
                <li><a href="about.html">About Us</a></li>
                <li><a href="parties.html">Groups & Parties</a></li>
              </ul>
          </div>
        </div>
        
    </footer>
</div>
</body>
</html>