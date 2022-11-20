# Módulo_GPT-J_NLP_NodeJs

* Módulo para el Procesamiento del Lenguaje Natural de código abierto (GPT-J) para la automatización de procesos en una aplicación


### Ejecución del Proyecto
* Crear un entorno de trabajo a través de algún IDE
* Clonar el Proyecto (`git clone https://github.com/andresWeitzel/Api_GPT-J_NLP_NodeJs`)
* Dentro del directorio instalar todos los plugins implementados
  * `npm install @banana-dev/banana-dev@3.0.0`

</br>

  
### Core GPT-J
* Ejemplo : https://www.banana.dev/pretrained-models/nodejs/gptj
* Modelos : https://www.banana.dev/pretrained-models/nodejs

</hr>

### Parámetros (Pesos) del Modelo
#### Ajuste de Temperatura
* La temperatura determina la exhaustividad del módelo generativo. 
* Establecer valores de temperatura bajos conlleva a un módelo más seguro. 
* Establecer valores de temperatura altos conlleva a un módelo más inestable. 



</br>

### Modelo Pre Carga Request
* Input Text Example : `I want to know the current temperature`

</br>

  ``` js
    const banana = require('@banana-dev/banana-dev');
    const config = require('../config.js');

    var apiKey = config.API_KEY;
    var modelKey = "gptj";

    const modelParameters = {
        "text": "i want to know the current temperature",
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

  ```
  
### Respuesta GPT-J

  ``` terminal
      {
      id: 'f6a977a7-ee41-413a-8ff7-3ead1ff888a9',
      message: 'success',
      created: 1668909272,
      apiVersion: '26 Nov 2021',
      modelOutputs: [
        {
          output: ' in my room in m/f form.I need temperature in celsius degrees.\n' +   
            '\n' +
            "If you need it for a certain time you would need to use a datetime object. Since python doesn't know dates, you need to use something that will tell it          which date and time to use in UTC.\n" +
            'from datetime import datetime\n' +
            '\n' +
            'now = datetime.now(datetime.UTC)\n' +
            'now.strftime("%m/%d/%y %H:%M:%S")\n' +
            '\n' +
            'You will need to parse the output first and format it yourself\n' +
            'h = now.strftime("%m/%d/%y %H:%M:%S")\n' +
            'print h.split(":")[0]:"%C"\n' +
            '\n' +
            'A:\n' +
            '\n' +
            '>>> import os\n' +
            ">>> os.popen('date').read()\n" +
            "'Sun Jul 24 17:17:41 CDT 2012'\n" +
            '\n',
          input: 'i want to know the current temperature'
        }
      ],
      callID: 'call_4c7ef155-1827-451b-b27c-650641fc273f'
    }

  ```
  
  </br>
  
  ## `DOCUMENTACIÓN EN PROCESO DE DESARROLLO`
