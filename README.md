# Construção do código e métodos de alteração ao repositóorio

## Estrutura do código
    src/
    ├── clientes/
    │      └── Categoria.java
    │      └── Cliente.java
    │      └── ClientePessoaFisica.java
    │      └── ClientePessoaJuridica.java
    │      └── ClienteService.java
    ├── produtos/
    │      └── Produto.java
    │      └── ProdutoService.java
    ├── vendas/
    │      └── DescontoFidelidade.java
    │      └── ItemVenda.java
    │      └── Venda.java
    │      └── VendaService.java
    └── Main.java

## Métodos de upar o código ao diretório referente a avaliação Mão na Massa 02
>Lembre de criar uma nova branch para cada nova funcionalidade ou correção de bug a partir da branch main
<br><br>

**A seguir você verá 2 métodos de se upar pastas para o github:**
 - Upar códigos com a origem já lincada ao github <br>
 >Indicado para casos onde o usuário já possui o diretório cadastrado e possui branches separadas <br><br>
 - Upar códigos com a origem não lincada ao github
 >Indicado para casos onde o usuário não configurou o diretório e não possui branches separadas <br><br>







## Para upar o código para um arquivo já ligado ao github:

- Dar Git Clone do Repositorio:

![image](https://github.com/user-attachments/assets/12a4354c-f170-478b-a151-550f7ccd54ef)

- Jogar os arquivos para dentro da pasta clonada do repositório:

![image](https://github.com/user-attachments/assets/57a55437-0956-4e8c-8e46-de9d05456ebf)


- Dar "cd" para entrar na pasta:

![image](https://github.com/user-attachments/assets/a27802b4-2372-42f0-9057-c279f83fe702)

 - git checkout -b nome-da-sua-branch
 - git add .
 - git commit -m "Descrição detalhada das suas alterações"


<br><br><br>
## Para upar o código para um arquivo não ligado ao github:

- Dar Git Clone do Repositorio:

![image](https://github.com/user-attachments/assets/12a4354c-f170-478b-a151-550f7ccd54ef)

- Jogar os arquivos para dentro da pasta clonada do repositório:

![image](https://github.com/user-attachments/assets/57a55437-0956-4e8c-8e46-de9d05456ebf)


- Dar "cd" para entrar na pasta:

![image](https://github.com/user-attachments/assets/a27802b4-2372-42f0-9057-c279f83fe702)


- Remover o Arquivo de Origem:

![image](https://github.com/user-attachments/assets/22d27a43-c29f-43d3-a7b1-a4b4960430dc)


- Clique na sua foto de perfil no canto superior direito do GitHub e vá nas configurações da conta
- Escolha a opção de Configuração de Desenvolvedor, escolha a opção Token de acesso pessoal e depois Token(Clásico),
- Em seguida você irá clicar em gerar um novo token e escolha a versão clássica novamente,
- Dê um nome para esse token e escolha a validade dele,
- Aceite todos os escopos,
- Gere o token,
- Copie o token gerado,
- Cole em um bloco de notas,
- Agora vá até a página onde você quer subir o arquivo e copie o URL do endereço Web e cole no bloco de notas,

Agora você irá organizar o texto da seguinte forma:

    https://{Token gerado anteriormente}@{O que sobrou do link fora o já inserido no inicio}
    
    por exemplo:
    
    https://ghp_AQyGetNL2w6Crd9ghUdJTh48pVnb1E2koWjo@github.com/Flerno14/Portfolio_Formado.git


- Adicione o Arquivo de Origem colando a linha concluida no passo anterior:

![image](https://github.com/user-attachments/assets/ea440d7f-15c3-419a-aa85-a47cc2055eda)


- Dê "git add.":

![image](https://github.com/user-attachments/assets/dd2bcd5c-11c1-464b-be55-055231b290a9)


- Nomeie a Versão:

![image](https://github.com/user-attachments/assets/1c4ec1ea-4fbb-45ff-a17c-b0b966e18daf)


- Envie os Arquivos:

![image](https://github.com/user-attachments/assets/29a41df9-5d02-4a20-b08c-368c580c1365)
