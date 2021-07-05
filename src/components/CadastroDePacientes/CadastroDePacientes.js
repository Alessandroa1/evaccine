import React, {Component} from 'react'
import { Form, Input, InputNumber, Button } from 'antd';
import  './CadastroDePacientes.css'
export default class CadastroDePacientes extends Component {

    constructor(props){
        super(props)
        this.state ={
            pessoas: [],
            message: null
   
        } 
    }          

render(){
  return (
   <div className= 'box'>  
   <h2>CADASTRO DE PACIENTES</h2>  
    <Form>
      <Form.Item
        name={['nome']}
        label="Nome"
        rules={[{required: true,},]}
        labelCol={{ span: 3 }}
        wrapperCol={{ span: 6 }}>
         <Input />
      </Form.Item>    
      <Form.Item
        name={['cpf']}
        label="CPF"
        rules={[{required: true,type: 'number',
        min: 11,
        max: 14,},]}
        labelCol={{ span: 3 }}
        wrapperCol={{ span: 6 }}
        >
         <Input />
      </Form.Item> 
      <Form.Item
        name={['telefone']}
        label="Telefone"
        rules={[{required:true, type: 'number',
            min: 11,
            max: 11,},]}
            labelCol={{ span: 3 }}
            wrapperCol={{ span: 6 }}>
           <Input placeholder="insira seu contato" />  
       </Form.Item>  
       <Form.Item
        name={['endereco']}
        label="Endereço"
        rules={[{required:true,          
            type: 'text',
            min: 0,
            max: 2,},]}
            labelCol={{ span: 3 }}
            wrapperCol={{ span: 6 }} >   
          <Input />
        </Form.Item>     

       <Form.Item
        name={['email']}
        label="Email"
        rules={[{type: 'email',}, ]}
        labelCol={{ span: 3 }}
        wrapperCol={{ span: 6 }}>       
              
        <Input />
      </Form.Item>
      <Form.Item
        name={['dataNascimento']}
        label="Data de Nascimento"
        rules={[{required:true,          
            type: 'number',
            min: 0,
            max: 8,},]}
            labelCol={{ span: 3 }}
            wrapperCol={{ span: 6 }}>
        <Input />
      </Form.Item>
      <Form.Item
        name={['idade']}
        label="Idade"
        rules={[{required:true,          
            type: 'number',
            min: 0,
            max: 2,},]}
            labelCol={{ span: 3 }}
            wrapperCol={{ span: 6 }} >   
          <Input />
        </Form.Item> 

             
              
      <Form.Item  wrapperCol={{ offset: 3, span: 16 }}>
        <Button type="primary" htmlType="submit"  >
          Submit
        </Button>
      </Form.Item>
    </Form>
  </div>
  )
    }
}
             
          
       
      
        













