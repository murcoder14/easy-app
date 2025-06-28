# Getting Started

This is a Spring Boot Reactive microservice that uses H2. The codebase is intentionally kept simple for experimenting with Jenkins and GitHub Actions.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Jenkins documentation](https://www.jenkins.io/doc/book/using/)
* [Jenkins Pipeline Guide](https://www.jenkins.io/doc/tutorials/#pipeline)
* [Docker in Docker Containerized CI Workflows](https://www.docker.com/resources/docker-in-docker-containerized-ci-workflows-dockercon-2023/)
* [Run Docker in Docker - Tutorial](https://devopscube.com/run-docker-in-docker/)
* [Use Docker DinD for CI](https://labex.io/tutorials/docker-how-to-use-docker-in-docker-for-efficient-container-workflows-398421)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

