# Technical  Challenge

This repo contains a small "Hello World" webserver which simulates a small microservice

## Tasks

 - Create a docker image for the microservice. The smaller the image, the better.
 - Create all required resources in Kubernetes to expose the microservice to the public. Make sure that the microservice has access to a volume mounted in /tmp for storing temp data.
 - When deployed in Kubernetes, pod should avoid nodes which are already running the microservice
 - Use MESSAGES env variable to configure the message displayed by the server
 - Make sure that the health of the microservice is monitored from Kubernetes perspective
 - Create a K8S resource for scale up and down the microservice based on the CPU load
 - Create a Jenkins pipeline for deploying the microservice.
 - Describe how to retrieve metrics from the microservice like CPU usage, memory usage...
 - Describe how to retrieve the logs from the microservice and how to store in a central location
 - Security wise, try to follow the best practices securing each of the points  whenever is possible 
