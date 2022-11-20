![Index app](https://github.com/andresWeitzel/Modulo_GPT-J_NLP_NodeJs/blob/master/doc/brain.jpg)

# Módulo_GPT-J-6B_NLP_NodeJs

* Módulo para el Procesamiento de Lenguaje Natural de código abierto ([GPT-J-6B](https://www.forefront.ai/blog-posts/gpt-j-6b-an-introduction-to-the-largest-open-sourced-gpt-model)).


## Ejecución del Proyecto
* Crear un entorno de trabajo a través de algún IDE
* Clonar el Proyecto (`git clone https://github.com/andresWeitzel/Api_GPT-J_NLP_NodeJs`)
* Dentro del directorio instalar todos los plugins implementados
  * `npm install @banana-dev/banana-dev@3.0.0`

</br>
  
## Api del Core GPT-J-6B
* [Ejemplificacón Base](https://www.banana.dev/pretrained-models/nodejs/gptj)
* [Generate Api Key](https://app.banana.dev/)
* [Modelos](https://www.banana.dev/pretrained-models/nodejs)

## Core Original GTP-J-6B (Mesh Transformer JAX)
* (El Core con el modelo No optimizado pesa 6gb. Con el Modelo Optimizado 61gb).
* [Repositorio](https://github.com/kingoflolz/mesh-transformer-jax/#mesh-transformer-jax)



</br>


</hr>

## Parámetros (Pesos) del Modelo
#### Input (text param)
* Corresponde a la capa de entrada que el modelo analizará (Ej: `generate two functions in javascript`)
#### Longitud del texto (length param)
* La longitud del texto de salida se mide en tokens, estos son secuencias de carácteres comunes, que se encuentran a través del core del modelo. 
* Cuanto mayor sea el número, mayor texto e información obtendremos en la salida.
#### Ajuste de Temperatura (temperature param)
* La temperatura determina la exhaustividad del modelo generativo. 
* Establecer valores de temperatura bajos conlleva a un módelo más seguro. 
* Establecer valores de temperatura altos conlleva a un módelo más inestable.
#### Tamaño del Lote (batchSize param)
* Se implementa para rendimiento de GPU.

#### Ejemplo de Parámetros
</br>

  ``` js
        "text": "i want to know the current temperature",
        "length": 250,
        "temperature": 0.9,
        "batchSize": 1
  ```

## Modelo de Capa Model Parameters implementado (Seteo) 

</br>

  ``` js
    
    module.exports.set = (text,length,temp,batch) =>{
        const  params = {
            "text": text,
            "length": length,
            "temperature": temp,
            "batchSize": batch
        }
        return params;
    }

  ```

## Modelo de Capa Runner implementado (Ejecución)

</br>

* Input : `Quiero saber la Temperatura Actual en Buenos Aires, Argentina` 

</br>

  ``` js
     //Imports
     const gptCore = require('@banana-dev/banana-dev');
     const config = require('../configs/config.js');
     const modelParameters = require('../models/modelParameters');
     //keys
     const apiKey = config.API_KEY;
     const modelKey = config.MODEL_KEY;
     //Params
     let text = "Quiero saber la Temperatura Actual en Buenos Aires, Argentina"
     let length = 400
     let temperature = 0.7
     let batchSize = 1

     let params = modelParameters.set(text,length,temperature, batchSize);


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

  ```
  
## Output Core GPT-J (Respuesta)

  ``` terminal
          message: 'success',
      created: 1668961622,
      apiVersion: '26 Nov 2021',
      modelOutputs: [
        {
          output: '\n' +
            '\n' +
            'Buenos Aires tiene una temperatura muy alta en el verano. Si eres una persona que vive en la Argentina y te gustaría saber cuál es el ritmo de calor que tienes en Buenos Aires, te presento mi método para saber la temperatura actual en Buenos Aires.\n' +
            '\n' +
            'No necesitas un GPS para saber la temperatura actual\n' +
            '\n' +
            'Sí, es cierto, puedes conocer la temperatura actual en cualquier punto de la ciudad en pocos segundos. Toda la información que necesitas está en las siguientes tablas.\n' +
            '\n' +
            'Para saber la temperatura actual en Buenos Aires, necesitas saber la temperatura de la zona de la ciudad donde estás ahora. Si eres en la ciudad, el ritmo de calor en Buenos Aires es bastante similar. Sin embargo, si eres en un punto de la ciudad fuera del centro, la temperatura será más alta.\n' +
            '\n' +
            'Para saber la temperatura de la zona donde estás ahora, simplemente debes saber tu punto de ubicación. Por ejemplo, si eres en la ciudad de Buenos Aires, entonces debes saber tu punto de ubicación para saber la temperatura de Buenos Aires.\n' +  
            '\n' +
            'Para saber tu punto de ubicación, no necesitas un GPS. Sólo necesitas saber 
    tu dirección y tu velocidad. La dirección y la velocidad son las dos coordenadas de tu posición.',
          input: 'Quiero saber la Temperatura Actual en Buenos Aires, Argentina'
        }
      ],
      callID: 'call_4a3b9440-fcb6-4122-b269-6ac55a46c3eb'
    }

  ```
  
  </br>
  
  ## `DOCUMENTACIÓN EN PROCESO DE DESARROLLO`
