function GuestPage() {

    return (

        <div>

            <h2>Welcome Guest</h2>

            <p>You can browse the available flight details.</p>

            <table border="1" cellPadding="10">

                <thead>

                    <tr>
                        <th>Flight</th>
                        <th>Source</th>
                        <th>Destination</th>
                    </tr>

                </thead>

                <tbody>

                    <tr>
                        <td>AI101</td>
                        <td>Chennai</td>
                        <td>Delhi</td>
                    </tr>

                    <tr>
                        <td>AI205</td>
                        <td>Bangalore</td>
                        <td>Mumbai</td>
                    </tr>

                </tbody>

            </table>

            <p><b>Please login to book tickets.</b></p>

        </div>

    );

}

export default GuestPage;