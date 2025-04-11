Aqui está o seu texto formatado em **Markdown** para ser utilizado no README do GitHub:

```markdown
# 🎊 API de Cadastro de Clientes e Eventos para Salão de Festas

Esta API permite o cadastro e consulta de **clientes** e **eventos** para um salão de festas.

## 🌐 Endpoint
A API está disponível no seguinte endpoint:

🔗 **[https://dio-rest-salao-production.up.railway.app/](https://dio-rest-salao-production.up.railway.app/)**

---

## 🧑‍🤝‍🧑 Clientes

### 📝 Cadastro de Cliente
Para cadastrar um novo cliente, envie uma requisição **POST** para `/client` com o seguinte corpo JSON:

```json
{
    "name": "Thamires",
    "cpf": "99999999",
    "phone": "5555555"
}
```

### 🔎 Consulta de Cliente
Para consultar um cliente existente, envie uma requisição **GET** para `/client` com o parâmetro `cpf`:

```plaintext
/client?cpf=55443433
```

---

## 🎈 Eventos

### 🎯 Cadastro de Evento
Para cadastrar um novo evento, envie uma requisição **POST** para `/event` com o seguinte corpo JSON:

```json
{
    "client": {
        "name": "John Doe",
        "cpf": "123.456.789-00",
        "phone": "11 99999-9999"
    },
    "date": "26/10/2025",
    "eventType": "WEDDING",
    "paymentStatus": "PAID"
}
```

### 📆 Consulta de Evento por Data
Para consultar eventos por data, envie uma requisição **GET** para `/event` com o parâmetro `date`:

```plaintext
/event?date=27/10/2025
```

---

✨ Agora, basta copiar e colar este conteúdo no arquivo `README.md` do seu repositório no GitHub! Se precisar de ajustes, me avise. 🚀😊
```

Isso deve deixar seu README mais organizado e visualmente agradável! Se precisar de mais personalização, só me chamar. 🚀🎉
