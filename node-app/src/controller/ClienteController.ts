import { Request, Response } from 'express';
import AppDataSource from '../DataSource';
import { Cliente } from '../entity/Cliente';

export default class ClienteController {
    async index(req: Request, res: Response) {

        const clientes = await AppDataSource.manager.find(Cliente)

        return res.json(clientes);
    }


    async store(request: Request, response: Response) {
        const { primeiroNome, sobreNome, telefone, email, dataNascimento } = request.body;

        const dataDeCadastro = new Date()

        const cliente = AppDataSource.manager.create(Cliente, {
            primeiroNome,
            sobreNome,
            dataDeCadastro,
            telefone,
            email,
            dataNascimento
        })

        await AppDataSource.manager.save(cliente)

        return response.status(201).json(cliente);
    }




}

