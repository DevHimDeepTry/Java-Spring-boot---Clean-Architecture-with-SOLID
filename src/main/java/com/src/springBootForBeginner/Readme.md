``` 
Clean Architecture Source Base #1
src
├── main
│   ├── java
│   │   ├── com.example.project
│   │   │   ├── enterpriseBusinessRules      // Tầng logic nghiệp vụ cốt lõi
│   │   │   │   ├── entities                 // Các entity trong domain (Entity & Domain Models)
│   │   │   │   ├── repositories             // Interface của repository (không phụ thuộc vào cụ thể database)
│   │   │   ├── applicationBusinessRules     // Tầng logic ứng dụng
│   │   │   │   ├── usecases                 // Các use case cụ thể (Application Services)
│   │   │   │   ├── dto                      // Data Transfer Objects (DTO)
│   │   │   │   ├── mapper                   // Mapper giữa entity và DTO
│   │   │   ├── interfaceAdapters            // Tầng adapter giao tiếp với bên ngoài
│   │   │   │   ├── controllers              // Các REST API controller cho giao diện người dùng
│   │   │   │   ├── gateways                 // Kết nối với tầng cơ sở dữ liệu (Database Gateways)
│   │   │   ├── frameworksAndDrivers         // Tầng framework và driver
│   │   │   │   ├── configuration            // Cấu hình cho Spring Boot và các dịch vụ khác
│   │   │   │   ├── persistence              // Lớp thực thi của repository (Database-specific Implementations)
│   │   │   └── ├── security                 // Cấu hình bảo mật và xử lý chứng thực
│   ├── resources
│   │   ├── application.properties           // File cấu hình ứng dụng
└── test
└── java                         
```
---
```
Clean Architecture Source Base #2
src
├── main
│   ├── java
│   │   ├── com.src.springBootForBeginner
│   │   │   ├── applicationBusinessRules          // Tầng logic ứng dụng
│   │   │   │   ├── constants                     // Chứa các hằng số dùng trong toàn bộ ứng dụng
│   │   │   │   │   ├── ApiResponseWithData.java  // Lớp đại diện cho cấu trúc phản hồi API có kèm dữ liệu (data). Lớp này được sử dụng để trả về phản hồi chứa dữ liệu và có thông điệp cùng mã trạng thái HTTP.
│   │   │   │   │   ├── ApiResponseWithoutData.java // Lớp đại diện cho cấu trúc phản hồi API không trả về dữ liệu
│   │   │   │   │   └── MessageApiResponse.java   // Định nghĩa các thông điệp phản hồi API
│   │   │   │   ├── dto                           // Các đối tượng DTO để truyền dữ liệu giữa các tầng
│   │   │   │   │   └── UserDTO.java              // DTO của đối tượng người dùng
│   │   │   │   ├── mapper                        // Mapper để chuyển đổi giữa DTO và Entity
│   │   │   │   │   └── UserMapper.java           // Chuyển đổi giữa User entity và UserDTO
│   │   │   │   ├── usecases                      // Chứa các use case cho ứng dụng
│   │   │   │   │   └── UserServices.java         // Định nghĩa các dịch vụ liên quan đến User
│   │   │   │   ├── utils                         // Các tiện ích, ví dụ xử lý phản hồi API
│   │   │   │       └── ApiResponseUtil.java      // Tạo ra các phản hồi chuẩn cho API của bạn, giúp giữ tính nhất quán trong cấu trúc phản hồi và đơn giản hóa mã xử lý phản hồi trong controller.
│   │   │   ├── enterpriseBusinessRules           // Tầng nghiệp vụ cốt lõi
│   │   │   │   ├── entities                      // Định nghĩa các thực thể cốt lõi của ứng dụng
│   │   │   │   │   └── User.java                 // Thực thể người dùng
│   │   │   │   ├── repositories                  // Interface định nghĩa các phương thức truy vấn cơ bản
│   │   │   │       ├── IBaseRepository.java      // Interface cơ bản cho các repository
│   │   │   │       └── IUserRepository.java      // Interface repository cho User
│   │   │   ├── frameworksAndDrivers              // Tầng framework và driver
│   │   │   │   ├── configuration                 // Cấu hình cho ứng dụng
│   │   │   │   │   └── AppConfig.java            // Cấu hình các bean và dịch vụ
│   │   │   │   ├── persistence                   // Thực thi repository cụ thể cho database
│   │   │   │   │   ├── BaseRepositoryImpl.java   // Thực thi các phương thức cơ bản của repository
│   │   │   │   │   └── UserRepositoryImpl.java   // Thực thi repository cho User
│   │   │   │   ├── security                      // Xử lý bảo mật (nếu có)
│   │   │   ├── interfaceAdapters                 // Adapter giao tiếp với bên ngoài
│   │   │   │   ├── controllers                   // Các controller cho API
│   │   │   │   │   └── UserControllers.java      // API điều khiển User
│   │   │   │   ├── gateways                      // Kết nối giữa repository và tầng logic ứng dụng
│   │   │   │       └── UserServiceImpl.java      // Triển khai UserServices
│   ├── resources
│   │   └── application.properties                // File cấu hình cho ứng dụng
└── test
    └── java                                      // Thư mục chứa các test case cho ứng dụng

```
---
- Link [**Clean Architecture A Craftsman Guide to Software Structure and Design.pdf**](https://github.com/GunterMueller/Books-3/blob/master/Clean%20Architecture%20A%20Craftsman%20Guide%20to%20Software%20Structure%20and%20Design.pdf)
- Link [**Spring Boot Documentation**](https://spring.io/projects/spring-boot)
- Link [**Design Patterns: Elements of Reusable Object-Oriented Software**](https://en.wikipedia.org/wiki/Design_Patterns)
- Link [**Clean Architecture Design Pattern**](https://stackoverflow.com/questions/52352815/clean-architecture-design-pattern)
---

![CleanArchitecture Image](https://res.cloudinary.com/dibgscxe8/image/upload/v1730097117/cleanArchitectureImage_mruvy9.jpg)

---
## Kiến trúc và vòng đời xử lý trong dự án
   Mô hình Clean Architecture chia dự án thành các tầng với trách nhiệm riêng biệt, nhằm tách biệt giữa các phần logic nghiệp vụ, giao diện người dùng, và các framework cụ thể. Điều này giúp cho mã nguồn dễ bảo trì, kiểm thử, và mở rộng. Trong kiến trúc này, dữ liệu và các xử lý sẽ di chuyển giữa các tầng thông qua các interface và adapter.

**Dưới đây là các tầng chính trong dự án và vòng đời xử lý của một yêu cầu từ người dùng:**
1. Tầng Giao diện Người dùng (Interface Adapters):
- UserControllers: Khi nhận được một yêu cầu từ người dùng (ví dụ, một yêu cầu GET để lấy danh sách người dùng), tầng này sẽ xử lý yêu cầu thông qua các controller. Các controller sẽ gọi các phương thức của tầng logic ứng dụng để lấy dữ liệu hoặc thực hiện các hành động cần thiết.
2. Tầng Logic Ứng dụng (Application Business Rules):
- Usecases: Các use case trong lớp này sẽ đại diện cho các hành động cụ thể mà ứng dụng có thể thực hiện. Ví dụ, UserServices có thể cung cấp chức năng lấy danh sách người dùng. Use case sẽ chuyển đổi dữ liệu từ tầng giao diện thành các đối tượng mà tầng logic nghiệp vụ có thể hiểu được.
- DTO (Data Transfer Objects): Là các đối tượng dùng để truyền dữ liệu giữa các tầng, giúp giảm phụ thuộc và tránh việc truyền trực tiếp các đối tượng domain.
- Mapper: Mapper là công cụ để chuyển đổi giữa DTO và Entity, nhằm đảm bảo mỗi tầng nhận được dữ liệu theo cấu trúc mà nó cần.
3. Tầng Nghiệp vụ Cơ bản (Enterprise Business Rules):
- Entities: Đây là các đối tượng trong domain của ứng dụng, đại diện cho các thực thể cốt lõi (ví dụ, User). Các entities chứa các logic nghiệp vụ cơ bản và không phụ thuộc vào bất kỳ framework nào.
- Repositories: Các interface trong tầng này xác định các phương thức thao tác với dữ liệu. Các interface này không phụ thuộc vào cụ thể cơ sở dữ liệu nào.
4. Tầng Framework và Driver (Frameworks and Drivers):
- Persistence: Chứa các lớp thực thi cụ thể cho các repository, ví dụ BaseRepositoryImpl và UserRepositoryImpl. Đây là nơi tương tác với cơ sở dữ liệu thực tế.
- Configuration: Cấu hình các dịch vụ của ứng dụng, ví dụ cấu hình Spring Boot.
- Security: Xử lý bảo mật, cấu hình các phương thức chứng thực và phân quyền (nếu có).

# Bạn Có Biết?
## 1. **DTO (Data Transfer Object) là gì?**
   **DTO** là viết tắt của Data Transfer Object – một mẫu thiết kế để chuyển dữ liệu giữa các lớp hoặc các tầng trong một ứng dụng.
### Mục đích của DTO:
- Truyền dữ liệu giữa các tầng trong ứng dụng mà không phụ thuộc vào các cấu trúc dữ liệu cốt lõi (entity).
- Giảm dữ liệu không cần thiết khi gửi qua mạng, ví dụ như chỉ lấy các thuộc tính cần thiết của User để hiển thị trong giao diện.
- Tách biệt tầng giao diện người dùng với tầng nghiệp vụ cốt lõi, giúp tránh phụ thuộc vào cấu trúc nội bộ của dữ liệu.

**Ví dụ:**
Trong ứng dụng, ```UserDTO``` có thể chỉ chứa các trường như ```id```, ```name```, và ```email``` để trả về thông tin người dùng. 
Ngược lại, lớp ```User``` (entity) có thể chứa các thông tin khác như ```password```, ```createdAt```, ```updatedAt```, các trường này không cần thiết để hiển thị cho người dùng.

## 2. Use Case (Trường hợp sử dụng) là gì?
   **Use Case** là cách tổ chức mã nguồn để định nghĩa các chức năng mà ứng dụng có thể thực hiện.

**Mục đích của Use Case:**
- Xác định và xử lý các hành động, yêu cầu cụ thể mà hệ thống cần thực hiện.
- Đảm bảo rằng các logic nghiệp vụ được triển khai độc lập và không phụ thuộc vào tầng giao diện hoặc tầng cơ sở dữ liệu.
- **Ví dụ**, trong ứng dụng của bạn, các use case có thể là:
  - **Lấy danh sách người dùng** (ví dụ: ```UserServices.getAllUsers()```)
  - **Thêm một người dùng mới**
  - **Xóa một người dùng**
## 3. Entity (Thực thể) là gì?
   **Entity** là các đối tượng cốt lõi của ứng dụng, đại diện cho các thực thể trong thế giới thực hoặc trong mô hình nghiệp vụ của ứng dụng. 
   Mỗi entity chứa các thuộc tính và hành vi liên quan.

**Mục đích của Entity:**
- Đóng gói dữ liệu và logic cốt lõi cho một thực thể.
- Độc lập với các framework hoặc tầng giao diện người dùng, vì nó chỉ đại diện cho dữ liệu cốt lõi.
- **Ví dụ:** Lớp ```User``` là một entity có thể chứa các thuộc tính như ```id```, ```name```, ```email```, và ```password```.
## 4. Repository (Kho lưu trữ) là gì?
   **Repository** là lớp hoặc interface chịu trách nhiệm thao tác dữ liệu, chẳng hạn như truy vấn, lưu trữ, cập nhật, và xóa dữ liệu từ cơ sở dữ liệu.

**Mục đích của Repository:**
- Tạo một lớp trừu tượng cho việc truy cập cơ sở dữ liệu, giúp tách biệt tầng nghiệp vụ cốt lõi với cách dữ liệu được lưu trữ.
- **Ví dụ:** ```UserRepository``` có thể cung cấp các phương thức như ```findById()```, ```findAll()```, ```save()```, và ```deleteById()```...
## 5. Interface Adapter (Bộ chuyển đổi giao diện) là gì?
   **Interface Adapter** là tầng giao diện kết nối giữa các tầng trong ứng dụng. Nó chuyển đổi dữ liệu từ tầng này sang tầng khác sao cho các tầng có thể tương tác một cách độc lập.

**Mục đích của Interface Adapter:**
- Điều chỉnh dữ liệu từ tầng này sang tầng khác (ví dụ: chuyển đổi giữa DTO và Entity).
- Đảm bảo rằng các tầng giao diện người dùng và tầng nghiệp vụ cốt lõi có thể hoạt động mà không cần hiểu biết sâu về cấu trúc dữ liệu của nhau.
## 6. Controller là gì?
   **Controller** là lớp điều khiển ở tầng giao diện người dùng, nhận và xử lý các yêu cầu từ người dùng hoặc API và gọi các Use Case để lấy dữ liệu hoặc thực hiện các hành động.

**Mục đích của Controller:**
- Xử lý các yêu cầu từ người dùng và gọi các Use Case tương ứng.
- Định nghĩa các API và quản lý phản hồi HTTP cho các yêu cầu khác nhau.
- **Ví dụ:** ```UserController``` có thể có các endpoint như``` /users```, ```/users/{id}```, tương ứng với các chức năng lấy danh sách người dùng, lấy thông tin người dùng theo ID.
## 7. Mapper là gì?
**Mapper** là lớp chuyên dụng để chuyển đổi giữa DTO và Entity.

**Mục đích của Mapper:**
- Chuyển đổi dữ liệu giữa các cấu trúc dữ liệu khác nhau, giúp tầng giao diện và tầng nghiệp vụ có thể tương tác mà không cần biết quá nhiều về cấu trúc dữ liệu của nhau.
- Đảm bảo rằng chỉ các dữ liệu cần thiết được truyền qua lại giữa các tầng.
## 8. Configuration (Cấu hình) là gì?
**Configuration** là nơi cấu hình các thành phần và dịch vụ trong ứng dụng.

**Mục đích của Configuration:**
- Cấu hình các bean, các dịch vụ như database connection, bảo mật (security), và các thành phần khác cần cho ứng dụng.
- Giúp tách biệt các thiết lập liên quan đến hạ tầng khỏi logic của ứng dụng.
## 9. Persistence Layer (Tầng lưu trữ) là gì?
**Persistence Layer** là tầng thực thi cụ thể của các repository, kết nối với cơ sở dữ liệu để lưu trữ và truy xuất dữ liệu.

**Mục đích của Persistence Layer:**
- Cung cấp lớp kết nối giữa tầng ứng dụng và cơ sở dữ liệu thực tế.
- Quản lý việc đọc/ghi dữ liệu vào cơ sở dữ liệu, thông qua các phương thức được định nghĩa trong repository interface.

---
## Tổng Kết
Những khái niệm này là các thành phần cốt lõi của kiến trúc Clean Architecture:

- **DTO** giúp truyền dữ liệu giữa các tầng mà không phụ thuộc vào entity.
- **Use Case** định nghĩa các hành động cụ thể mà ứng dụng có thể thực hiện.
- **Entity** là các đối tượng nghiệp vụ chính của ứng dụng.
- **Repository** cung cấp lớp truy cập dữ liệu cho các entity.
- **Interface Adapter** kết nối các tầng của ứng dụng với nhau, giúp giảm phụ thuộc giữa các tầng.
- **Controller** xử lý yêu cầu từ người dùng và điều hướng chúng đến các use case.
- **Mapper** chuyển đổi dữ liệu giữa DTO và entity.
- **Configuration** định cấu hình các dịch vụ cần thiết trong ứng dụng.
- **Persistence Layer** quản lý lưu trữ dữ liệu với cơ sở dữ liệu.