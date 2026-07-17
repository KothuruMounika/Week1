import { useState } from 'react';

function CurrencyConvertor() {

    const [rupees, setRupees] = useState("");

    const [euro, setEuro] = useState("");

    function handleSubmit() {

        const value = Number(rupees);

        const converted = value / 90;

        setEuro(converted.toFixed(2));

    }

    return (

        <div>

            <h2>Currency Convertor</h2>

            <input
                type="number"
                placeholder="Enter Rupees"
                value={rupees}
                onChange={(e) => setRupees(e.target.value)}
            />

            <br /><br />

            <button onClick={handleSubmit}>
                Convert
            </button>

            <h3>Euro : € {euro}</h3>

        </div>

    );

}

export default CurrencyConvertor;