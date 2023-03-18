"use strict";
const AWS = require('aws-sdk');
AWS.config.update({
    region: "local",
    endpoint: "http://localhost:8000"
  });
const docClient = new AWS.DynamoDB.DocumentClient();



// Function to getAllItems from DB
module.exports.get = async () => {
    let table = "usersTable";
    let year = 2015;
  
    let title = "The Big New Movie";
  
    let params = {
      TableName: table,
      Key: {
        "year": year,
        "title": title
      }
    }
  
    try {
      let result = await docClient.get(params).promise();
  
      console.log(result);
  
      return {
        body: JSON.stringify({
          message: "Executed succesfully",
          data: result
        })
      }
    } catch (error) {
      console.log(error);
    }
  }