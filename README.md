# Course-Api


<img src="https://miro.medium.com/max/952/1*4ZPi1b_ca54pUE9xRB-IFQ.jpeg" width="150px" height="50px">

![Build Status](https://travis-ci.org/Bagurp/course-Api.svg?branch=master)

Course-Api is a simple REST service for Topics and Courses.

### New Features!

  - Etag support for resources.
  - Precise HTTP response codes.
  - In memory DB support - Apache Derby

#### Installation to clone project
- Java 1.8.0_221
- Apache Maven 3.5.4

<br/><br/>

Two controllers are available on this project - **Topic** and **Course**. A *Topic* can have multiple *Courses* [just like in a college]

#### *Topic*
_______________________________________________

HTTP defines a set of request methods to indicate the desired action to be performed for a given resource. The following methods are supported by the Api for *Topic* controller -

**GET**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```http://localhost:8080/topics/```	

**GET**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```http://localhost:8080/topics/Java/```

**POST**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*URL*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```	http://localhost:8080/topics/```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*Header*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```Content-Type = Application/Json	```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*Body*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```
		{
		  "id": "OS",
		  "name": "Operating Systems and the Kernal",
		  "description": "Operating Systems tutorial"
		}
    ```

**PUT**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*URL*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```	http://localhost:8080/topics/OS```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*Header*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```Content-Type = Application/Json	```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*Body*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```
		{
		  "id": "OS",
		  "name": "Operating Systems",
		  "description": "Operating Systems tutorial"
		}
    ```
	
**DELETE**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```	http://localhost:8080/topics/OS```

#### *Courses*
_______________________________________________
The following methods are supported by the Api for *Courses* controller -

**GET**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```http://localhost:8080/topics/OS/courses/```	

**GET**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```http://localhost:8080/topics/OS/courses/Scheduling```

**POST**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*URL*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```	http://localhost:8080/topics/OS/courses```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*Header*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```Content-Type = Application/Json	```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*Body*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```
        {
           "id": "Scheduling",
           "name": "Process scheduling",
           "description": "Process scheduling tutorial"
        }
    ```

**PUT**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*URL*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```	http://localhost:8080/topics/OS/courses/Scheduling```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*Header*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```Content-Type = Application/Json	```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	*Body*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```
		{
	        "id": "Scheduling",
	        "name": "Process scheduling and operations",
	        "description": "Process scheduling tutorial"
	    }
    ```
	
**DELETE**

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	```	http://localhost:8080/topics/OS/courses/Scheduling```
