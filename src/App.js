import { Layout, Menu } from 'antd';
import "antd/dist/antd.css";
import Routes from './routes';



const {Header, Content, Footer} = Layout;
export default function App() {
  return (
    <div>
      <Layout className= "layout">
        <Header >
          <div className="logo"> 
            <Menu theme="dark" mode="horizontal" defaultSelectedKeys={['1']}> 
            <Menu.Item  key="1">Home</Menu.Item>                      
            <Menu.Item key="2">Cadastro de Pacientes</Menu.Item>
            <Menu.Item key="3">Lista de Pacientes</Menu.Item>         
            <Menu.Item key="4">Agendamentos de Vacinação</Menu.Item>
            <Menu.Item key="5">Lista de Agendamentos</Menu.Item>
            </Menu>
          </div>
        </Header>
        <Content >
          <div className="site-layout-content">          
             <Routes />       
          </div>
        </Content>
          <Footer style={{backgroundColor:'#C2D3E0'},{textAlign:'center'}}>eVaccine developed By Equipe Rocket TM</Footer>
      </Layout>
    </div>
  );
}      
     