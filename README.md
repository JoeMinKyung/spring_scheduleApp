

# Schedule

## 필수 과제

### API

<div style="overflow-x: auto;">

#### Schedule

| **Method** | **Endpoint**         | **Description**                     | **Parameters**                                                                            | **Request Body**                                                                                                 | **Response**                                                                                                                                     | **Status Code** |
|------------|----------------------|-------------------------------------|-------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|-----------------|
| `POST`     | `/schedules`         | 일정 생성                           | 없음                                                                                        | `{ "title": string, "content": string, "username": string }`                                                   | `{ "title": string, "content": string,, "username": string, "createdAt": string, "updatedAt": string }`                              | `200 OK`        |
| `GET`      | `/schedules`         | 일정 목록 조회                      | Query: <br> - `updatedDate` (예: "2025-02-02", `optional`)<br> - `memberName` (`optional`) | 없음                                                                                                             | `[ { "id": long, "title": string, "content": string,, "username": string, "createdAt": string, "updatedAt": string }, ... ]`                      | `200 OK`        |
| `GET`      | `/schedules/{id}`    | 일정 단건 조회                       | Path: <br> - `id`                                                                         | 없음                                                                                                             | `{ "id": long, "title": string, "content": string,, "username": string, "createdAt": string, "updatedAt": string }`                               | `200 OK`        |
| `PUT`      | `/schedules/{id}`    | 일정 수정                            | Path: <br> - `id`                                                                         | `{ "title": string, "content": string,, "username": string, }`                                                   | `{ "title": string, "content": string,, "username": string, "createdAt": string, "updatedAt": string }`                               | `200 OK`        |
| `DELETE`   | `/schedules/{id}`    | 일정 삭제                           | Path: <br> - `id` <br> Query: <br> - `password` (`mandatory`)                              | 없음                                                                                                             | 없음                                                                                                                                             | `200 OK`        |

</div>

#### Member

| **Method** | **Endpoint**              | **Description**                 | **Parameters**                                                                                                                                                 | **Request Body**                                                                                                  | **Response**                                                                                                                                                          | **Status Code** |
|------------|---------------------------|---------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------|
| `POST`     | `/members`              | 회원 생성                       | 없음                                                                                                                                                             | `{"username": string, "password": string, "email": string}`                                                  | `{ "id": long, "username": string, "email": string, "createdAt": string, "updatedAt": string }`                                                     | `200 OK`        |
| `GET`      | `/members/login`              | 로그인         | 없음 | 없음                                                                                                              | 페이지 형태의 `{ "content": [ { "id": long, "task": string, "memberEmail": string, "password": string, "createdAt": string, "updatedAt": string }, ... ], "pageable": {...}, ... }` | `200 OK`        |
| `GET`      | `/members/{id}`         | 회원 단건 조회                | Path: <br> - `id`                                                                                                                                              | 없음                                                                                                              | `{ "id": long, "task": string, "memberEmail": string, "password": string, "createdAt": string, "updatedAt": string }`                                                     | `200 OK`        |
| `PUT`      | `/members/{id}`         | 회원 수정                     | Path: <br> - `id`                                                                                                                                              | `{ "task": string, "memberEmail": string, "password": string }`                                                   | `{ "id": long, "task": string, "memberEmail": string, "password": string, "createdAt": string, "updatedAt": string }`                                                     | `200 OK`        |
| `PATCH`      | `/members/{id}`         | 회원 비밀번호 수정                     | Path: <br> - `id`                                                                                                                                              | `{ "task": string, "memberEmail": string, "password": string }`                                                   | `{ "id": long, "task": string, "memberEmail": string, "password": string, "createdAt": string, "updatedAt": string }`                                                     | `200 OK`        |
| `DELETE`   | `/members/{id}`         | 일정 삭제                     | Path: <br> - `id` <br> Query: <br> - `memberName` (`mandatory`) <br> - `password` (`mandatory`)                                                                    | 없음                                                                                                              | 없음                                                                                                                                                                   | `200 OK`        |


<br>



<br>

### ERD

![](https://velog.velcdn.com/images/mk3701/post/1a80022f-0501-450b-bdc5-78eace73f30c/image.png)
