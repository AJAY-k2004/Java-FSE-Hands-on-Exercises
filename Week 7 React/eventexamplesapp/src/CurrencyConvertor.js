import React, { Component } from "react";

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: "",
      currency: "",
    };
  }

  handleAmountChange = (e) => {
    this.setState({ amount: e.target.value });
  };

  handleCurrencyChange = (e) => {
    this.setState({ currency: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const { amount, currency } = this.state;
    const rate = 0.011; // Example conversion rate: 1 INR = 0.011 EUR

    if (currency.toLowerCase() === "euro") {
      const converted = amount * rate;
      alert(`Converting to Euro amount is €${converted.toFixed(2)}`);
    } else if (currency.toLowerCase() === "inr") {
      const converted = amount / rate;
      alert(`Converting to INR amount is ₹${converted.toFixed(2)}`);
    } else {
      alert("Unsupported currency. Please enter 'euro' or 'inr'.");
    }
  };

  render() {
    return (
      <div>
        <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
        <form onSubmit={this.handleSubmit}>
          <div>
            Amount:{" "}
            <input
              type="number"
              value={this.state.amount}
              onChange={this.handleAmountChange}
            />
          </div>
          <div>
            Currency:{" "}
            <input
              type="text"
              value={this.state.currency}
              onChange={this.handleCurrencyChange}
            />
          </div>
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConvertor;
