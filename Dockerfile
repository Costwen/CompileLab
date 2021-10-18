# FROM frolvlad/alpine-gxx
# WORKDIR /app/
# COPY lab01/Lex.cpp ./
# RUN g++ Lex.cpp -o Lex
# RUN chmod +x Lex

FROM frolvlad/alpine-gxx
WORKDIR /app/
COPY lab02/parsing ./
# RUN g++ Lex.cpp -o Lex
RUN chmod +x init.sh

