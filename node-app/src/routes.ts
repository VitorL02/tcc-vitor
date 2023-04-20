import { Router } from 'express';
import ClienteController from '../src/controller/ClienteController';

const router = Router();

const clienteController = new ClienteController();

router.get('/allClients', clienteController.index);
router.post('/clientes', clienteController.store);


export default router;