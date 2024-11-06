import React, { useState } from 'react'; //Importa react e o hook useState
import { View, Text, TextInput, Button, StyleSheet} from 'react-native';

// Função principoal do App
const App =() => {
  //Estados para armazenar o nome do usuário e a senha 
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  //Função que é chamada quando o botão de login é clicado
  const handleLogin = () =>{
    //Aqui, você poderia adicionar a lógica
    alert(`Usuário: ${username} \nSenha: ${password}`); //Exibe o alert
  }


  return (
    //Container principal
    <View style = {styles.container}>
      <Text style = {styles.title}> Tela de login</Text>
      <TextInput 
        style = {styles.input}
        placeholder = "Nome de Usuário"
        value = {username}
        onChangeText = {setUsername} //Atualize o estado do nome
      />
      <TextInput 
        style = {styles.input}
        placeholder = "Senha"
        secureTextEntry = {true} //Não mostra a senha
        value = {password}
        onChangeText = {setPassword} //Atualize o estado da senha
      />
      <Button title = "Entrar" onPress = {handleLogin} /> {/*Botão de login*/}
    </View>
  )
}

//Definição de estilos
const styles = StyleSheet.create({
  container: {
    flex:1, //Ocupa toda a altura da tela
    justifyContent: 'center', //Centraliza os itens vertical
    alignItems: 'center', // Centraliza os itens na horizazontal
    backgroundColor: '#f5f5f5', // Cinza claro
  },
  title: {
    fontSize: 24, //Tamanho da fonte
    fontWeight: 'bold', //Texto negrito
    marginBottom: 20, //Espaço abaixo do título
  },
  input:{
    height: 40, //altura do campo
    borderColor: '#ccc', //Cor da borda
    borderWidth: 1, //Largura da orda
    marginBottom: 15, //Espaço abaixo do campo
    paddingHorizontal: 10, //Espaçamento interno 
    width: '80%', //Largura do campo
  },
});

export default App
