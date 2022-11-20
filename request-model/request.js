const banana = require('@banana-dev/banana-dev');
const config = require('../config.js');

var apiKey = config.API_KEY;
var modelKey = "gptj";

const modelParameters = {
    "text": "generate two functions in javascript",
    "length": 250,
    "temperature": 0.9,
    "batchSize": 1
}

let run = async (modelParameters) => {
    var out = await banana.run(apiKey, modelKey, modelParameters)
    console.log(out)
    return out
}

run(modelParameters)