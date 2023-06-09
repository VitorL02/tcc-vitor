import { DataSource } from "typeorm"
import { Cliente } from "./entity/Cliente"





const AppDataSource = new DataSource({
    type: "postgres",
    host: "localhost",
    port: 8000,
    username: "postgres",
    password: "123",
    database: "tccdb",
    entities: [Cliente,
        // ....
    ],
    synchronize: true,
})


AppDataSource.initialize().then(() => {
    console.log("Data Source has been initialized!")
})
    .catch((err) => {
        console.error("Error during Data Source initialization", err)
    })


export default AppDataSource