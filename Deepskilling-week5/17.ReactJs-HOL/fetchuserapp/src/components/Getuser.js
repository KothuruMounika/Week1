import React, { Component } from "react";

class Getuser extends Component {

    constructor(props) {
        super(props);

        this.state = {
            title: "",
            firstname: "",
            image: ""
        };
    }

    componentDidMount() {

        fetch("https://api.randomuser.me/")
            .then((response) => response.json())
            .then((data) => {

                this.setState({

                    title: data.results[0].name.title,
                    firstname: data.results[0].name.first,
                    image: data.results[0].picture.large

                });

            });

    }

    render() {

        return (

            <div className="container">

                <h2>Random User Details</h2>

                <img
                    src={this.state.image}
                    alt="User"
                />

                <h3>
                    {this.state.title} {this.state.firstname}
                </h3>

            </div>

        );

    }

}

export default Getuser;