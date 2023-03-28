
import { Entity, Column, PrimaryGeneratedColumn } from 'typeorm';

@Entity({ name: 'tb_cliente' })
export class Cliente {

    @PrimaryGeneratedColumn("uuid")
    uuid: string;

    @Column({ name: "primeiro_nome" })
    primeiroNome: string;

    @Column({ name: "sobre_nome" })
    sobreNome: string;

    @Column({ type: 'timestamp', name: "data_de_cadastro" })
    dataDeCadastro: Date;


    @Column({ name: "telefone" })
    telefone: string;

    @Column({ name: "email" })
    email: string;

    @Column({ name: "data_nascimento" })
    dataNascimento: string;


}
