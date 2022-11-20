
module.exports.set = (text,length,temp,batch) =>{
    const  params = {
        "text": text,
        "length": length,
        "temperature": temp,
        "batchSize": batch
    }
    return params;
}
