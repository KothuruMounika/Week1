import './App.css';
import { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {

  const [count, setCount] = useState(0);

  function increment() {
    setCount(count + 1);
  }

  function sayHello() {
    alert("Hello! You clicked Increase.");
  }

  function handleIncrease() {
    increment();
    sayHello();
  }

  function decrement() {
    setCount(count - 1);
  }

  function sayWelcome(message) {
    alert(message);
  }

  function handleSyntheticEvent(e) {
    alert("I was clicked");
  }

  return (

    <div className="App">

      <h1>React Event Examples</h1>

      <h2>Counter : {count}</h2>

      <button onClick={handleIncrease}>
        Increment
      </button>

      &nbsp;

      <button onClick={decrement}>
        Decrement
      </button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={handleSyntheticEvent}>
        OnPress
      </button>

      <br /><br />

      <CurrencyConvertor />

    </div>

  );

}

export default App;