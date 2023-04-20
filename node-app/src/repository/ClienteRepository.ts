import { EntityRepository, Repository } from 'typeorm';
import { Cliente } from '../entity/Cliente';

@EntityRepository(Cliente)
export class ClienteRepository extends Repository<Cliente> { }
