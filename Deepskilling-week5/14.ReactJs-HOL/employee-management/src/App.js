import React, { Component } from "react";
import EmployeeList from "./components/EmployeeList";
import ThemeContext from "./ThemeContext";
import "./App.css";
class App extends Component {

  state = {
    theme: "light"
  };

  toggleTheme = () => {
    this.setState({
      theme: this.state.theme === "light" ? "dark" : "light"
    });
  };

  render() {
    return (
      <ThemeContext.Provider value={this.state.theme}>
        <div>

          <h1>Employee Management</h1>

          <button onClick={this.toggleTheme}>
            Toggle Theme
          </button>

          <EmployeeList />

        </div>
      </ThemeContext.Provider>
    );
  }
}

export default App;