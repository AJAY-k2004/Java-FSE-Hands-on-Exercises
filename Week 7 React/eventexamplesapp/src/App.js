import React, { Component } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };
  }

  // Increment method
  increment = () => {
    this.setState((prevState) => ({ count: prevState.count + 1 }));
    this.sayHello();
  };

  // Decrement method
  decrement = () => {
    this.setState((prevState) => ({ count: prevState.count - 1 }));
  };

  // Say Hello message
  sayHello = () => {
    alert("hello Member1");
  };

  // Say Welcome message with argument
  sayWelcome = (message) => {
    alert(message);
  };

  // Synthetic Event Handler
  handleClick = (e) => {
    e.preventDefault(); // Synthetic event
    alert("I was clicked");
  };

  render() {
    return (
      <div style={{ padding: "20px" }}>
        <h3>{this.state.count}</h3>

        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />

        <button onClick={() => this.sayWelcome("welcome")}>Say Welcome</button>
        <br /><br />

        <button onClick={this.handleClick}>Click on me</button>
        <br /><br />

        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
