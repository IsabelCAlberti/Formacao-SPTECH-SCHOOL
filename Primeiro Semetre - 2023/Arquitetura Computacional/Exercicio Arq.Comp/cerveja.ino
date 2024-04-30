#include "DHT.h"
#define dht_type DHT11 //define qual o tipo de sensor DHTxx que se está
/**
* Configurações iniciais sobre os sensores
* DHT11, LM35, LDR5 e TCRT5000
*/
int dht_pin = A2;
DHT dht_1 = DHT(dht_pin, dht_type); //pode-se configurar diversos
int lm35_pin = A0, leitura_lm35 = 0;
float temperatura;

void setup()
{
Serial.begin(9600);
dht_1.begin();
}

void loop()
{
/**
* Bloco do DHT11
*/
leitura_lm35 = analogRead(lm35_pin);
temperatura = leitura_lm35 * (5.0/1023) * 100;
Serial.print(temperatura);
Serial.println(";");
delay(2000);
}

