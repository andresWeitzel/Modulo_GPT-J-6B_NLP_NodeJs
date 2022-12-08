//Imports
const gptCore = require('@banana-dev/banana-dev');
const config = require('../configs/config.js');
const modelParameters = require('../models/modelParameters');
//keys
const apiKey = config.API_KEY;
const modelKey = config.MODEL_KEY;
//Params
let text = "Quiero saber la Temperatura Actual en Buenos"
let length = 400
let temperature = 0.7
let batchSize = 1



module.exports.run = async (textInput) => {
    try {
        let params = modelParameters.set(textInput,length,temperature, batchSize);
        
        var out = await gptCore.run(apiKey, modelKey, params)
        
        console.log(out)
        
        return out

    } catch (error) {
        console.log(error);
    }
 
}

