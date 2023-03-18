"use strict";
const AWS = require('aws-sdk');
AWS.config.update({
    region: "local",
    endpoint: "http://localhost:8000"
  });
const docClient = new AWS.DynamoDB.DocumentClient();


// Function to Create an Item to DB
module.exports.add = async (event) => {
    try {
  
      let table = "usersTable";
      let year = 2015;
      let title = "The Big New Movie";
  
      let params = {
        TableName: table,
        Item: {
          "year": year,
          "title": title,
          "info": {
            "plot": "Nothing happens at all",
            "rating": 0
          }
        }
      }
  
      let result = await docClient.put(params).promise();
      if (result) {
        console.log(">>>>>>>>>", result);
      }
  
      console.log("hello world")
      return {
        statusCode: 200,
        body: JSON.stringify({
          message: "Go Serverless v1.0! Your function executed successfully!",
          data: result
        }),
      };
    } catch (error) {
      console.log(error);
      return error;
    }
  };
  