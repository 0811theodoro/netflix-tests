# language: pt
# encoding: utf-8

Funcionalidade: Buscar Filmes na pagina do Netflix
Como usuario
Quero realizar busca por filmes na plataforma
Para encontrar os títulos que desejo assistir

@busca
Esquema do Cenario: 
Dado que estou na pagina de busca
Quando inserir o termo de busca: "<busca>"
E clicar no primeiro resultado
Entao iniciara o filme "<titulo>"

    Exemplos: 
      | busca  				| titulo 											 |
      | sonic  				| Sonic the Hedgehog - Netflix |
      | casa de papel | Money Heist - Netflix        |
