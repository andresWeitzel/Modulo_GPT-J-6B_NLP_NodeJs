const gptCore = require('@banana-dev/banana-dev');
const config = require('../configs/config.js');
const modelParameters = require('../models/modelParameters');

let apiKey = config.API_KEY;
let modelKey = config.MODEL_KEY;

let params = modelParameters.set();


let run = async (params) => {
    try {
        var out = await gptCore.run(apiKey, modelKey, params)
        console.log(out)
        return out
    } catch (error) {
        console.log(error);
    }
 
}

run(params)