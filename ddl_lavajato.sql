create database lavajato;
    
create table clientes(
    id serial primary key,
    telefone varchar(15) unique not null,
    nome varchar(255) not null
);

create table veiculos(
    placa varchar(8) primary key,
    modelo varchar(100) not null,
    tipo varchar(255) not null,
    cor varchar(50) not null,
    cliente_id serial4 not null,
    foreign key(cliente_id) references clientes(id)
);

create table servicos(
    id serial primary key,
    descricao varchar(30) not null,
    preco decimal(10,2) not null,
    previsao_entrega varchar(25) not null,
    data_servico timestamp default current_timestamp,
    placa varchar(8) not null,
    foreign key(placa) references veiculos(placa)
);
    