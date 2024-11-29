<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registratian</title>
    <style>
        body {
            background-color: #f2f6ff;
            margin: 0;
            padding: 16px;
        }

        form {
            background-color: white;
            text-align: center;
            width: 700px;
            margin-left: auto;
            margin-right: auto;
            border: 1px solid #ccc;
        }

        #form-heading {
            font-size: 32px;
            padding-top: 56px;
            padding-bottom: 32px;
        }

        #input-wrapper {
            padding-top: 80px;
            padding-bottom: 40px;
            padding-left: 80px;
            padding-right: 80px;
        }

        .input-box {
            font-size: 18px;
            Padding-Bottom: 12px;
            Margin-Bottom: 36px;
            Border: 0;
            Border-Bottom: 1px solid #ccc;
            width: 100%;
        }

        #btn-submit {
            Background-Color: #0056ff;
            Padding-Top: 12px;
            padding-Bottom: 12px;
            Padding-Left: 24px;
            padding-right: 24px;
            Font-Size: 18px;
            Color: white;
            Border: None;
        }
    </style>
</head>

<body>
     <form action="<%= request.getContextPath() %>/register" method="post">
        <h1 id="form-heading">Visitor Register Form</h1>
        <div id="input-wrapper">
            <div>
                <input class="input-box" type="text" name="first-name" placeholder="First Name" required>
            </div>
            <div>
                <input class="input-box" type="text" name="last-name" placeholder="Last Name" required>
            </div>
            <div>
                <input class="input-box" type="email" name="email" placeholder="Email" required>
            </div>
            <div>
                <input class="input-box" type="password" name="password" placeholder="Password" required>
            </div>
            <div>
                <input class="input-box" type="text" name="phone-number" placeholder="Phone Number" required>
            </div>
            <div>
                <input class="input-box" type="text" name="address" placeholder="Address" required>
            </div>
            <div>
                <input class="input-box" type="text" name="age" placeholder="Age" required>
            </div>
            <input id="btn-submit" type="submit" value="Submit">
        </div>
    </form>
</body>

</html>