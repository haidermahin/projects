<!DOCTYPE html>
<html>
<head>
    <title>MoviePlex | Trailers</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Bebas Neue' rel='stylesheet'>
	<link href='https://fonts.googleapis.com/css?family=Work Sans' rel='stylesheet'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
        }
        
        body{
			margin-top:5%;
			padding-top:50px;
		}
        
        .inline-block {
            display: inline-block;
            padding: 10px
        }
        
        .btn {
            margin-bottom: 15px;
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
        }
        
        .checked {
          color: orange;
        }
        
      
    </style>
</head>

<body>
  <div id="wrapper">    
    <br><br>
    <h1 id="title"> Trailers </h1>
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
                <a href="trailers.html" class="nav-link" style="color:white;font-weight:bold;" onMouseOver="this.style.color='black'"
        onMouseOut="this.style.color='white'">TRAILERS</a>
            </li>
			<li class="nav-item">
                <a href="./food.html" class="nav-link" style="color:white;" onMouseOver="this.style.color='black'"
        onMouseOut="this.style.color='white'">FOOD/DRINKS</a>
            </li>
            <li class="nav-item">
                <a href="./contact.html" class="nav-link" style="color:white;" onMouseOver="this.style.color='black'"
        onMouseOut="this.style.color='white'">CONTACT US</a>
            </li>
            <li class="nav-item">
                <a href="./locations.html" class="nav-link" style="color:white;" onMouseOver="this.style.color='black'"
        onMouseOut="this.style.color='white'"> LOCATIONS</a>
            </li>
            <li class="nav-item">
                <a href="./news.html" class="nav-link news active" style="color:white;" onMouseOver="this.style.color='black'"
        onMouseOut="this.style.color='white'"> NEWS</a>
            </li>
        </ul>
    </div>
	</div>
</nav>
    
    <br>
    <!-- Dropdown for Genre -->
    <div class="btn-group">
      <button type="button" class="btn btn-danger">Filter by Genre</button>
      <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        <span class="sr-only">Filter by Genre</span>
      </button>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="trailers.php?fn=action_adventure">Action/Adventure</a>
        <a class="dropdown-item" href="trailers.php?fn=comedy_drama">Comedy/Drama</a>
        <a class="dropdown-item" href="trailers.php?fn=horror_thriller">Horror/Thriller</a>
        <a class="dropdown-item" href="trailers.php?fn=sci_fi">Sci-Fi</a>  
      </div>
    </div>
    
    <!-- Dropdown for Ratings -->
    <div class="btn-group">
      <button type="button" class="btn btn-danger">Filter by Ratings</button>
      <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        <span class="sr-only">Filter by Ratings</span>
      </button>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="trailers.php?fn=PG">PG</a>
        <a class="dropdown-item" href="trailers.php?fn=PG_13">PG-13</a>
        <a class="dropdown-item" href="trailers.php?fn=R">R</a>
      </div>
    </div>

    <!-- Dropdown for Date Sorting -->
    <div class="btn-group">
      <button type="button" class="btn btn-danger">Sort by Viewer Ratings</button>
      <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        <span class="sr-only">Sort by Viewer Ratings</span>
      </button>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="trailers.php?fn=highest_rated">Highest Viewer Rated</a>
        <a class="dropdown-item" href="trailers.php?fn=lowest_rated">Lowest Viewer Rated</a>
      </div>
    </div>

    <!-- Dropdown for Date Sorting -->
    <div class="btn-group">
      <button type="button" class="btn btn-danger">Filter by Release Date</button>
      <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        <span class="sr-only">Filter by Release Date</span>
      </button>
      <div class="dropdown-menu">
        <a class="dropdown-item" href="trailers.php?fn=now_playing">Now Playing</a>
        <a class="dropdown-item" href="trailers.php?fn=coming_soon">Coming Soon</a>
      </div>
    </div>
    
    <a href="https://movie-plex.000webhostapp.com/trailers.html" class="btn btn-secondary">Clear Filter</a>

    <br><br><br><br>
    


    <?php
    //Queries for displaying trailers based on the button the user pressed
    if ($_GET['fn'] == "action_adventure") {
        $sql = "SELECT title, trailer, genre, release_date, rating, synopsis, movie, ROUND(AVG(movie_rating),0) AS rat FROM movies, ratings WHERE title = movie AND (genre = 'Action' OR genre = 'Adventure') GROUP BY title, trailer, genre, release_date, rating, synopsis";
    }    
    elseif ($_GET['fn'] == "comedy_drama") {
        $sql = "SELECT title, trailer, genre, release_date, rating, synopsis, movie, ROUND(AVG(movie_rating),0) AS rat FROM movies, ratings WHERE title = movie AND (genre = 'Comedy' OR genre = 'Drama') GROUP BY title, trailer, genre, release_date, rating, synopsis";
    }
    elseif ($_GET['fn'] == "horror_thriller") {
        $sql = "SELECT title, trailer, genre, release_date, rating, synopsis, movie, ROUND(AVG(movie_rating),0) AS rat FROM movies, ratings WHERE title = movie AND (genre = 'Horror' OR genre = 'Thriller') GROUP BY title, trailer, genre, release_date, rating, synopsis";
    } 
    elseif ($_GET['fn'] == "sci_fi") {
        $sql = "SELECT title, trailer, genre, release_date, rating, synopsis, movie, ROUND(AVG(movie_rating),0) AS rat FROM movies, ratings WHERE title = movie AND genre = 'Sci-Fi' GROUP BY title, trailer, genre, release_date, rating, synopsis";
    }
    elseif ($_GET['fn'] == "PG") {
        $sql = "SELECT title, trailer, genre, release_date, rating, synopsis, movie, ROUND(AVG(movie_rating),0) AS rat FROM movies, ratings WHERE title = movie AND rating = 'PG' GROUP BY title, trailer, genre, release_date, rating, synopsis";
    }
    elseif ($_GET['fn'] == "PG_13") {
        $sql = "SELECT title, trailer, genre, release_date, rating, synopsis, movie, ROUND(AVG(movie_rating),0) AS rat FROM movies, ratings WHERE title = movie AND rating = 'PG-13' GROUP BY title, trailer, genre, release_date, rating, synopsis";
    }
    elseif ($_GET['fn'] == "R") {
        $sql = "SELECT title, trailer, genre, release_date, rating, synopsis, movie, ROUND(AVG(movie_rating),0) AS rat FROM movies, ratings WHERE title = movie AND rating = 'R' GROUP BY title, trailer, genre, release_date, rating, synopsis";
    }
    elseif ($_GET['fn'] == "now_playing") {
        $sql = "SELECT title, trailer, genre, release_date, rating, synopsis, movie, ROUND(AVG(movie_rating),0) AS rat FROM movies, ratings WHERE title = movie AND now_playing = 1 GROUP BY title, trailer, genre, release_date, rating, synopsis";
    }
    elseif ($_GET['fn'] == "coming_soon") {
        $sql = "SELECT title, trailer, genre, release_date, rating, synopsis, movie, ROUND(AVG(movie_rating),0) AS rat FROM movies, ratings WHERE title = movie AND now_playing = 0 GROUP BY title, trailer, genre, release_date, rating, synopsis";
    }
    elseif ($_GET['fn'] == "highest_rated") {
        $sql = "SELECT title, trailer, genre, release_date, rating, synopsis, movie, ROUND(AVG(movie_rating),0) AS rat FROM movies, ratings WHERE title = movie GROUP BY title, trailer, genre, release_date, rating, synopsis ORDER BY rat DESC";
    }
    elseif ($_GET['fn'] == "lowest_rated") {
        $sql = "SELECT title, trailer, genre, release_date, rating, synopsis, movie, ROUND(AVG(movie_rating),0) AS rat FROM movies, ratings WHERE title = movie GROUP BY title, trailer, genre, release_date, rating, synopsis ORDER BY rat ASC";
    }
        $servername = "localhost";
        $username = "id15329740_admin";
        $password = "WebDev530530-";
        $database = "id15329740_movies";
    
        // Create connection
        $conn = new mysqli($servername, $username, $password, $database);
        
        // Check connection
        if ($conn->connect_error) {
            die("Connection failed: " . $conn->connect_error);
        }
        //echo "Connected successfully";
    
        $result = mysqli_query($conn, $sql);
        $rows = mysqli_num_rows($result);
      
        //Displays the data
        if ($rows > 0) {
                while($row = mysqli_fetch_assoc($result)) {
                        $name = $row["title"];
                        $link = $row["trailer"];
                        $genre = $row["genre"];
                        $release_date = $row["release_date"];
                        $rating = $row["rating"];
                        $synopsis = $row["synopsis"];
                        $movie_rating = $row["rat"];
                        $YTVideo = '<div class="video-responsive"><iframe width="560" height="315" src="'.$link.'" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></div>';
                       
                       echo '<div class="inline-block">';
                       echo '<h2 style="color:white;">' . $name . '</h2>';
                       echo '<span style="font-size: 14pt; color:white;">' . $genre.'</span>';
                       echo '<span style="font-size: 14pt; color:white;">' . "  |  " . $release_date. '</span>';
                       echo '<span style="font-size: 14pt; color:white;">' . "  |  " . $rating. '</span><br>';
                       
                                             if ($movie_rating == 1) {
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star'></span>";
                            echo "<span class='fa fa-star'></span>";
                            echo "<span class='fa fa-star'></span>";
                            echo "<span class='fa fa-star'></span>";
                      }  
                      if ($movie_rating == 2) {
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star'></span>";
                            echo "<span class='fa fa-star'></span>";
                            echo "<span class='fa fa-star'></span>";
                      }  
                      if ($movie_rating == 3) {
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star'></span>";
                            echo "<span class='fa fa-star'></span>";
                      } 
                      elseif ($movie_rating == 4) {
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star'></span>";
                      } 
                      elseif ($movie_rating == 5) {
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star checked'></span>";
                            echo "<span class='fa fa-star checked'></span>";
                      }
                      
                       echo "<br>";
                       echo "$YTVideo";
                       echo '<br></div>';
                }
        } else {
            echo '<br><br><span style="font-size: 14pt; color:white;">' . "Results not found" .'</span>';
        } 
                
    ?>    
    
    <!--Footer-->
    <footer class="class=footer">
            
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