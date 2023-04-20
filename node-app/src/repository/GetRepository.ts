import { getRepository } from 'typeorm/browser';
import { Cliente } from '../entity/Cliente';

export function getClienteRepository() {
    return getRepository<Cliente>(Cliente);
}